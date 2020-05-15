const GUIDE = {
  call: function (url, type, parameter, callback) {
    $.ajax({
      url: url,
      type: type,
      data: parameter,
      success: function (data, status, xhr) {
        callback(status, data);
      },
      error: function (xhr, status, error)  {
        callback(status, xhr);
      }
    });
  },
  // 이벤트 설정
  EVENTS: function () {
    this.onClickGuide();
    this.onClickGuide2();
    this.onClickGuide3();
  },
  // 클릭 이벤트
  onClickGuide: function ()  {
    $('#guideButton').off('click').on('click', function (event) {
      GUIDE.call('/api/guide.json', 'POST', {
        lang: 'ko',
        topN: '100',
        source: 'blog',
        keyword: '아이폰',
        endDate: '20200507',
        startDate: '20200407',
        categorySetName: 'SM',
        outputOption: ['freq'],
        cutOffFrequencyMin: '0',
        cutOffFrequencyMax: '0',
        command: 'GetKeywordAssociation'
      }, function (status, result)  {
        if (status ==='success')  {
          console.log(result);
        } else {  
          console.log(result);
        }
      });
      // 이벤트 버블링 제거
      // event.stopPropagation();
      // 태그의 기본 동작 제거
      // event.preventDefault();
    });
  },
  // 클릭 이벤트
  onClickGuide2: function () {
    $('#guideButton2').off('click').on('click', function (event) {
      GUIDE.call('/api/guide2.json', 'GET', {}, function (status, result) {
        if (status === 'success') {
          console.log(result);
        } else {
          console.log(result);
        }
      });
      // 이벤트 버블링 제거
      // event.stopPropagation();
      // 태그의 기본 동작 제거
      // event.preventDefault();
    });
  },
  // 클릭 이벤트
  onClickGuide3: function () {
    $('#guideButton3').off('click').on('click', function (event) {
      GUIDE.call('/api/guide3.json', 'GET', {}, function (status, result) {
        if (status === 'success') {
          console.log(result);
        } else {
          console.log(result);
        }
      });
      // 이벤트 버블링 제거
      // event.stopPropagation();
      // 태그의 기본 동작 제거
      // event.preventDefault();
    });
  }
};

$(function () {
  let variable = {};

  // 스프링 시큐리티 csrf 설정
  // 안하면 403 에러 발생
  let token = $("meta[name='_csrf']").attr("content");
  let header = $("meta[name='_csrf_header']").attr("content");

  $(function () {
    $(document).ajaxSend(function (e, xhr, options) {
      xhr.setRequestHeader(header, token);
    });
  });

  GUIDE.EVENTS();
});