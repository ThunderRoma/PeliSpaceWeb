var $els = $('.menucat a, .menucat header');
var count = $els.length;
var grouplength = Math.ceil(count/3);
var groupNumber = 0;
var i = 1;
$('.menucat').css('--count',count+'');
$els.each(function(j){
    if ( i > grouplength ) {
        groupNumber++;
        i=1;
    }
    $(this).attr('data-group',groupNumber);
    i++;
});

$('.menucat footer button').on('click',function(e){
    e.preventDefault();
    $els.each(function(j){
        $(this).css('--top',$(this)[0].getBoundingClientRect().top + ($(this).attr('data-group') * -15) - 20);
        $(this).css('--delay-in',j*.1+'s');
        $(this).css('--delay-out',(count-j)*.1+'s');
    });
    $('.menucat').toggleClass('closed');
    e.stopPropagation();
});

// run animation once at beginning for demo
setTimeout(function(){
    $('.menucat footer button').click();
    setTimeout(function(){
        $('.menucat footer button').click();
    }, (count * 100) + 500 );
}, 1000);

//boton ver
$(document).ready(function() {
    $('.buttonVer').click(function () {
        var url = $(this).attr('rel');
        $('#iframe').attr('src', url);
        $('#iframe').reload();
        });
    });

//Modal
$(document).ready(function () {
    autoPlayYouTubeModal();
});

function autoPlayYouTubeModal() {
        var trigger = $('.videoModalTriger');
    trigger.click(function () {
        var theModal = $(this).data("target");
        var videoSRC = $(this).attr("data-videoModal");
        var videoSRCauto = videoSRC + "?autoplay=1";
        $(theModal + ' iframe').attr('src', videoSRCauto);
        $(theModal).on('hidden.bs.modal', function (e) {
            $(theModal + ' iframe').attr('src', '');
        });
    });
};


var number = Math.round(userDetails.length / elements_per_page);//get total page number
for(i=0;i<=number;i++) {
$('.nav').append('<button class="btn">'+i+'</button>');//append a button for each page
}
$('.nav button').click(function(){//bind a click event
var start = $(this).text();//get the current page
table.empty();//empty the table
limit = 3*(parseInt(start)+1) > max_size ? max_size: 3*(parseInt(start)+1);//set the limit to max size if the limit is bigger then the max size
goFun(start*3,limit); //populate the table
});