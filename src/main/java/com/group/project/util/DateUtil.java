package com.group.project.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DateUtil {
    static final Logger LOGGER = LoggerFactory.getLogger(DateUtil.class);
    static final String[] dayArr = {"일", "월", "화", "수", "목", "금", "토"};
    
    /**
     * 시스템의 오늘 일자 반. 
     */
    public static Date getToday() {
        Calendar cal = Calendar.getInstance(); 
        cal.setTime( new Date() );
        return cal.getTime();
    }    

    /**
     * 문자열을 날짜형으로 변환.
     */
    public static Date getToday(String date) {
        Calendar cal = Calendar.getInstance(); 
        cal.setTime( str2Date(date) );
        return cal.getTime();
    }   
    
    /**
     *  날짜를 문자열로 변환.
     */
    public static String date2Str(Date date) {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        return ft.format( date.getTime() );    
    }
    
    /**
     *  문자열을 날짜(yyyy-MM-dd)로 변환.
     */
    public static Date str2Date(String date) {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        Date ret = null;
        try {
            ret = ft.parse( date ) ;
        } catch (ParseException ex) {
            LOGGER.error("date parse error ");
        }
        return ret ;
    }
    
    /**
     *  날짜를 년월일로 구분하여 저장.
     */
    public static Map<String, Object> date2VO(Date date) {
        Map<String, Object> dateObj = new HashMap<String, Object>();
        Calendar cal = Calendar.getInstance(); 
        cal.setTime( date );
        
        dateObj.put("year", cal.get(Calendar.YEAR) );
        dateObj.put("month", cal.get(Calendar.MONTH) + 1 );
        dateObj.put("day", cal.get(Calendar.DAY_OF_MONTH) );
        dateObj.put("week", dayArr[ cal.get(Calendar.DAY_OF_WEEK) - 1] );
        return dateObj;    
    }
    
    /**
     * 년도 추출.
     */
    public static Integer getYear(Date date) {
        Calendar cal = Calendar.getInstance(); 
        cal.setTime( date );

        return cal.get(Calendar.YEAR);
    }
    
    /**
     * 월 추출.
     */
    public static Integer getMonth(Date date) {
        Calendar cal = Calendar.getInstance(); 
        cal.setTime( date );

        return cal.get(Calendar.MONTH) + 1;
    }

    /**
     * 한 주의 순서 (요일).
     * 예: 일요일 = 0
     */
    public static Integer getDayOfWeek(Date date) {
        Calendar cal = Calendar.getInstance(); 
        cal.setTime( date );
        return cal.get(Calendar.DAY_OF_WEEK) - 1;    
    }
    
    /**
     * 월의 몇 번째 주 인지 추출.
     * 예: 반환값이 4이면 (7월) 4번째 주
     */
    public static Integer getWeekOfMonth(Date date) {
        Calendar cal = Calendar.getInstance(); 
        cal.setTime( date );
        return cal.get(Calendar.WEEK_OF_MONTH);    
    }
    
    public static String getWeekString(Integer idx) {
        return dayArr[idx];    
    }
    
    /**
     *  한주의 시작일자.
     */
    
    public static Date getFirstOfWeek(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime( date );
        Integer dw = cal.get(Calendar.DAY_OF_WEEK) - 1;
        cal.add(Calendar.DATE, dw * -1);
        return cal.getTime();    
    }
    
    /**
     *  한주의 종료일자.
     */
    public static Date getLastOfWeek(Date date) {               
        Calendar cal = Calendar.getInstance();
        cal.setTime( date );
        Integer dw = cal.get(Calendar.DAY_OF_WEEK);
        cal.add(Calendar.DATE, 7 - dw);
        return cal.getTime();    
    }

    /**
     *  월의 시작일.
     */
    public static Date getFirstOfMonth() {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        
        String str = ft.format( Calendar.getInstance().getTime() );
        
        return str2Date(str.substring(0, 8) + "01");    
    }

    /**  
     * 두 날짜(date1,date2)의 일수: 시간 포함해서 계산하면 오류가 있어 날짜만 추출해서 계산.
     */
    public static Integer dateDiff(Date date1, Date date2) {
        String dt1 = date2Str(date1);
        String dt2 = date2Str(date2);

        Integer day = (int) ( (str2Date(dt1).getTime() - str2Date(dt2).getTime()) / (24 * 60 * 60 * 1000) );
        return day;
    }    

    /** 
     * 날자 계산: -1은 감소.
     */
    public static Date dateAdd(Date date, Integer calDay) {
        Calendar cal = Calendar.getInstance(); 
        cal.setTime(date);
        cal.add(Calendar.DATE, calDay);  
        
        return cal.getTime();
    }    
    
    /** 
     * 달 계산: -1은 감소.
     */
    public static Date monthAdd(Date date, Integer month) { 
        Calendar cal = Calendar.getInstance(); 
        cal.setTime(date);
        cal.add(Calendar.MONTH, month); 
        
        return cal.getTime();
    }    
    
    /**
     * 생일로 나이 계산
     * @param birthDay
     * @return
     */
    public static int getAgeFromBirthDay(Date birthDay) {
        Calendar birth = new GregorianCalendar();
        Calendar today = new GregorianCalendar();

        birth.setTime(birthDay);
        today.setTime(new Date());

        int factor = 0;
        if (today.get(Calendar.DAY_OF_YEAR) < birth.get(Calendar.DAY_OF_YEAR)) {
            factor = -1;
        }
        return today.get(Calendar.YEAR) - birth.get(Calendar.YEAR) + factor;
    }
    
    /**
     * 문자열 생일로 나이 계산
     * @param birthDay
     * @return
     */
    public static int getAgeFromBirthDay(String birthDay) {
        
    	if(birthDay == null || birthDay.length() < 8){
    		return -9999;
    	}

    	Calendar birth = getStringDateToCalendarDate(birthDay);
        Calendar today = new GregorianCalendar();
        
        today.setTime(new Date());

        int factor = 0;
        if (today.get(Calendar.DAY_OF_YEAR) < birth.get(Calendar.DAY_OF_YEAR)) {
            factor = -1;
        }
        return today.get(Calendar.YEAR) - birth.get(Calendar.YEAR) + factor;
    }

    /**
     * 문자열 생일로 나이 계산
     * @param birthDay
     * @return
     */
    public static int getAgeFromBirthDay(String birthYear, String birthMonth, String birthDay) {

        if(birthYear == null || birthMonth == null || birthDay == null){
            return -9999;
        }

        Calendar birth = getStringDateToCalendarDate(birthYear, birthMonth, birthDay);
        Calendar today = new GregorianCalendar();

        today.setTime(new Date());

        int factor = 0;
        if (today.get(Calendar.DAY_OF_YEAR) < birth.get(Calendar.DAY_OF_YEAR)) {
            factor = -1;
        }
        return today.get(Calendar.YEAR) - birth.get(Calendar.YEAR) + factor;
    }


    /**
     * 문자열 일시를 Calendar로 변환
     * @param strDate
     * @return
     */
    public static Calendar getStringDateToCalendarDate(String strDate){
       	if(strDate == null || strDate.length() < 8){
    		return null;
    	}
    	
    	Calendar toDate = new GregorianCalendar();
        
    	strDate = strDate.replaceAll("-", "");
        
        int year;
		int month;
		int day;
		
		try {
			year = Integer.parseInt(strDate.substring(0, 4));
			month = Integer.parseInt(strDate.substring(4, 6));
			day = Integer.parseInt(strDate.substring(6, 8));
			
			toDate.set(Calendar.YEAR, year);
			toDate.set(Calendar.MONTH, month-1);
			toDate.set(Calendar.DATE, day);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

        
        return toDate;
    }

    /**
     * 년월일을 Calendar로 변환
     * @param pYear
     * @param pMonth
     * @param pDay
     * @return
     */
    public static Calendar getStringDateToCalendarDate(String pYear, String pMonth, String pDay){

        Calendar toDate = new GregorianCalendar();

        if(pYear == null || pYear.equals("") || pMonth == null || pMonth.equals("") || pDay == null || pDay.equals("")){
            return toDate;
        }

        int year;
        int month;
        int day;

        try {
            year = Integer.parseInt(pYear);
            month = Integer.parseInt(pMonth);
            day = Integer.parseInt(pDay);

            toDate.set(Calendar.YEAR, year);
            toDate.set(Calendar.MONTH, month-1);
            toDate.set(Calendar.DATE, day);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }


        return toDate;
    }
    
	/**
	 * String to 포멧된 날짜
	 * @param source
	 * @return
	 */
	public static String getFormattedDtm(String source) {
		
		return getFormattedDtm(source, null);
	}
	
	/**
	 * String to 포멧된 날짜 (포멧 옵션)
	 * @param source
	 * @param dateFormat
	 * @return
	 */
	public static String getFormattedDtm(String source, String dateFormat) {
	
		String fmrmattedDtm = "";
		
		if(source != null && source.length() == 14){
			if(dateFormat == null){
				dateFormat = "yyyy/MM/dd HH:mm:ss";
			}
			
			try {
				SimpleDateFormat parseSdf = new SimpleDateFormat("yyyyMMddHHmmss");
				Date tempDate = parseSdf.parse(source);
				
				SimpleDateFormat formatSdf = new SimpleDateFormat(dateFormat);
				fmrmattedDtm = formatSdf.format(tempDate);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		
		return fmrmattedDtm;
	}

    /**
     * 시작일과 종료일 사이의 날짜 목록 리턴
     * @param inputStartDate
     * @param inputEndDate
     * @return
     */
    public static ArrayList<String> getDayTermList(String inputStartDate, String inputEndDate) {

	    ArrayList<String> dayList = new ArrayList();

        final String DATE_PATTERN = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_PATTERN);
        Date startDate = null;
        Date endDate = null;
        try {
            startDate = sdf.parse(inputStartDate);
            endDate = sdf.parse(inputEndDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        ArrayList<String> dates = new ArrayList<String>();
        Date currentDate = startDate;
        while (currentDate.compareTo(endDate) <= 0) {
            dates.add(sdf.format(currentDate));
            Calendar c = Calendar.getInstance();
            c.setTime(currentDate);
            c.add(Calendar.DAY_OF_MONTH, 1);
            currentDate = c.getTime();
        }
        for (String date : dates) {
        	LOGGER.error(date);
            dayList.add(date);
        }

        return dayList;
    }
	
	/**
	 * @return yyyyMMdd
	 */
	public static String getCurrentYear() {
		GregorianCalendar gc = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		return sdf.format(gc.getTime());
	}
	
	/**
	 * @return yyyyMMdd
	 */
	public static String getCurrentYearMonth() {
		GregorianCalendar gc = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
		return sdf.format(gc.getTime());
	}
	
	/**
	 * @return yyyyMMdd
	 */
	public static String getCurrentYmd() {
		GregorianCalendar gc = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		return sdf.format(gc.getTime());
	}

	/**
	 * getCurrentDtm
	 * @return
	 */
	public static String getCurrentDtm() {
		GregorianCalendar gc = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		return sdf.format(gc.getTime());
	}
	
	
    /**
     * 숫자열인지 검사
     * @param s
     * @return
     */
    public static boolean isStringDouble(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
      }
    
}
