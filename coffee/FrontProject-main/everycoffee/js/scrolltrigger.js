$(document).ready(function(){
  $('section').mousewheel(function(event,delta){
    if(delta>0){
        let prev = $(this).prev().offset().top;
        $('html,body').stop().animate({'scrollTop':prev},1200, )
    } 
    else if(delta<0){
        let next = $(this).next().offset().top;
        $('html,body').stop().animate({'scrollTop':next},1200, )
    }
    })
})