const GUIDE = (function() {
  /**
   * API 요청(Ajax)
   * @param {*} url 
   * @param {*} type 
   * @param {*} parameter 
   * @param {*} callback 
   */
  function api(url, type, parameter, callback)  {
    return $.ajax({
      url: url,
      type: type,
      data: parameter,
      success: function (data, status, xhr) {
        return callback(status, data);
      },
      error: function (xhr, status, error)  {
        return callback(status, xhr);
      }
    });
  }

  /**
   * API 결과 그리기
   * @param {*} target 
   * @param {*} data 
   */
  function drawAPIResult(target, data)  {
    $('#' + target).html(JSON.stringify(data));
  }

  /**
   * AmChart Container 생성
   * @param {*} target 
   * @param {*} width 
   * @param {*} height 
   */
  function getContainer(target, width, height) {
    let container = am4core.create(target, am4core.Container);
    container.width = am4core.percent(width);
    container.height = am4core.percent(height);

    return container;
  }

  /**
   * 추이 차트
   * @param {*} target 
   * @param {*} data 
   */
  function drawTransition(target, data) {
    // am4core.disposeAllCharts();

    $('#' + target).empty();

    let container = getContainer(target, 100, 100);
    let chart = container.createChild(am4charts.XYChart);

    chart.data = data;

    let categoryAxis = chart.xAxes.push(new am4charts.CategoryAxis());
    categoryAxis.renderer.minGridDistance = 50;
    categoryAxis.dataFields.category = 'date';

    let valueAxis = chart.yAxes.push(new am4charts.ValueAxis());

    let series = chart.series.push(new am4charts.LineSeries());
    series.dataFields.valueY = 'freq';
    series.dataFields.categoryX = 'date';
    series.tooltipText = "{date}: {freq}";

    chart.cursor = new am4charts.XYCursor();
    chart.cursor.xAxis = valueAxis;
  }

  /**
   * 추이 차트 그리기 쉽게 변경
   * @param {*} data 
   */
  function procTransition(data) {
    let list = [];

    for (let i = 0, len = data.rows.length; i < len; i++)  {
      let item = Object.assign({}, data.rows[i]);

      list.push({
        date: item.date,
        freq: item['아이폰'].frequency
      });
    }

    return list;
  }

  /**
   * 감성어 차트 
   * @param {*} target 
   * @param {*} data 
   */
  function drawSentiment(target, data)  {
    $('#' + target).empty();

    let container = getContainer(target, 100, 100);
    let chart = container.createChild(am4charts.PieChart);

    chart.data = data;
    chart.innerRadius = am4core.percent(30);

    let pieSeries = chart.series.push(new am4charts.PieSeries());
    pieSeries.dataFields.value = 'freq';
    pieSeries.dataFields.category = 'sentiment';
  }

  /**
   * 감성어 차트 그리기 쉽게 변경
   * @param {*} data 
   */
  function procSentiment(data)  {
    let list = [];

    let neutral = 0;
    let positive = 0;
    let negative = 0;

    for (let i = 0, len = data.rows.length; i < len; i++) {
      let item = Object.assign({}, data.rows[i]['아이폰']);

      neutral += item.neutral;
      positive += item.positive;
      negative += item.negative;
    }

    list.push({ sentiment: 'neutral', freq: neutral });
    list.push({ sentiment: 'negative', freq: negative });
    list.push({ sentiment: 'positive', freq: positive });

    return list;
  }

  /**
   * 원문보기 테이블 
   * @param {*} target 
   * @param {*} data 
   */
  function drawDocumentTable(target, data)  {
    let $target = $('#' + target);
    $target.empty();

    let $html = '';
    $html += '<table>';
    $html +=  '<thead>';
    $html +=    '<tr>';
    $html +=      '<th>날짜</th>';
    $html +=      '<th>제목</th>';
    $html +=      '<th>내용</th>';
    $html +=    '</tr>';
    $html +=  '<tbody>';

    for (let i = 0, len = data.documentList.length; i < len; i++) {
      let item = data.documentList[i];

      $html += '<tr>';
      $html +=  '<td>' + item.date + '</td>';
      $html +=  '<td>' + item.title + '</td>';
      $html +=  '<td>' + item.content + '</td>';
      $html += '</tr>';
    }

    $html +=  '</tbody>';
    $html +=  '</thead>';
    $html += '</table>';

    $target.html($html);
  }

  /**
   * TM2 API 호출
   */
  function onClickGuideWithTm2()  {
    $('#guideButton').off('click').on('click', function (event) {
      // 버즈 추이
      api('/api/tm2', 'GET', {
        lang: 'ko',
        source: 'blog',
        keyword: '아이폰',
        endDate: '20200728',
        startDate: '20200628',
        start_weekday: 'SUNDAY',
        cutOffFrequencyMin: '0',
        cutOffFrequencyMax: '0',
        command: 'GetKeywordTransitions'
      }, function (status, result)  {
        if (status ==='success')  {
          console.log(result);
          drawTransition('drawTransition', procTransition(result.data));
        } else {  
          console.log(result);
        }

        return false;
      });

      // 감성어 
      api('/api/tm2', 'GET', {
        lang: 'ko', 
        topN: '100', 
        period: '0', 
        source: 'blog', 
        keyword: '아이폰', 
        invertRowCol: 'on', 
        endDate: '20200728', 
        startDate: '20200628', 
        categorySetName: 'TSN', 
        start_weekday: 'SUNDAY', 
        cutOffFrequencyMin: '0', 
        cutOffFrequencyMax: '0', 
        command: 'GetAssociationTransitionBySentiment'
      }, function (status, result)  {
        if (status ==='success')  {
          console.log(result);
          drawSentiment('drawSentiment', procSentiment(result.data));
        } else {  
          console.log(result);
        }

        return false;
      });

      // 원문보기
      api('/api/tm2', 'GET', {
        lang: 'ko', 
        pageNum: '1', 
        orderType: '0', 
        source: 'blog', 
        keyword: '아이폰', 
        rowPerPage: '20', 
        endDate: '20200728', 
        startDate: '20200628', 
        command: 'GetKeywordDocuments'
      }, function (status, result)  {
        if (status ==='success')  {
          console.log(result);
          drawDocumentTable('drawDocument', result.data);
        } else {  
          console.log(result);
        }

        return false;
      });
    });
  }

  /**
   * MyBatis API 호출 
   */
  function onClickGuideWithMyBatis()  {
    $('#guideButton2').off('click').on('click', function (event) {
      api('/api/mybatis/1', 'GET', {}, function (status, result) {
        if (status === 'success') {
          console.log(result);
          drawAPIResult('forMyBatis', result);
        } else {
          console.log(result);
        }

        return false;
      });
    });
  }

  /**
   * JPA API 호출
   */
  function onClickGuideWithJPA()  {
    $('#guideButton3').off('click').on('click', function (event) {
      api('/api/jpa/1', 'GET', {}, function (status, result) {
        if (status === 'success') {
          console.log(result);
          drawAPIResult('forJPA', result);
        } else {
          console.log(result);
        }

        return false;
      });
    });
  }

  return {
    setEvents: function() {
      onClickGuideWithTm2();
      onClickGuideWithJPA();
      onClickGuideWithMyBatis();
    }
  };
})();