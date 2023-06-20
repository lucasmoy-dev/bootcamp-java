let categories = [
]

let question = {
}


$(document).ready(function() {
  $('#dialog').hide();
  $('#result').hide();
  var spins = 0;

  load();

  $('#btnRefresh').click(function() {
    load();
  });

	$('.spin-button').click(function() {
    spins++;
    let result = Math.floor(Math.random() * 6);
    loadQuestion(categories[result].category)


    totalDegree = 61 * (result + 1);
    totalDegree += spins * 180 * 6;
    $('#wheel').css({'transform' : 'rotate(' + totalDegree + 'deg)'});

    setTimeout(function() {
      
    $('#btnClose').hide();
    $('#btnSend').show();
    $('#explanation').text('');
    $('#result').hide();

    $('#dialog #option1').prop('checked', false);
    $('#dialog #option2').prop('checked', false);
    $('#dialog #option3').prop('checked', false);
    $('#explanation').text(question.explanation);
    $('#dialog .question').text(question.question);
    $('#dialog label[for="option1"]').text(question.options[0]);
    $('#dialog label[for="option2"]').text(question.options[1]);
    $('#dialog label[for="option3"]').text(question.options[2]);

      $('#dialog').fadeIn();
    }, 1700);
	});
  
  $('.fa-heart').click(function() {
    $('.overlay').fadeIn();
  })
  
  $('.overlay').click(function() {
    $(this).fadeOut();
  })

  $('#btnClose').click(function() {
    $('#dialog').fadeOut();
  });

  $('#btnSend').click(function() {
    $('#btnSend').hide();
    $('#btnClose').show();
    $('#result').fadeIn();
    
    if ($('#dialog #option' + (question.answer+1)).is(':checked')) {
      $('#result-ok').show();
      $('#result-fail').hide();
    } else {
      $('#result-ok').hide();
      $('#result-fail').show();
    }

  });

});


async function loadQuestion(category) {
  let allowOrigin = 'https://api.allorigins.win/raw?url=';
  if ($('#txtUrlQuestion').val().includes('localhost')) {
    allowOrigin = '';
  }
  let urlQuestion = allowOrigin + $('#txtUrlQuestion').val() + '/' + category;

  let response = await fetch(urlQuestion);
  question = await response.json();
}


async function load() {
  let allowOrigin = 'https://api.allorigins.win/raw?url=';
  if ($('#txtUrlQuestion').val().includes('localhost')
  || $('#txtUrlCategories').val().includes('localhost')) {
    allowOrigin = '';
  }
  let urlQuestion = allowOrigin + $('#txtUrlQuestion').val();
  let urlCategories = allowOrigin + $('#txtUrlCategories').val();

  let response = await fetch(urlQuestion);
  question = await response.json();
  
  response = await fetch(urlCategories);
  categories = await response.json();

  for (var i = 0; i < categories.length; i++) {
    $('.wheel .section').find('span').eq(i).html(categories[i].category);
  }
}