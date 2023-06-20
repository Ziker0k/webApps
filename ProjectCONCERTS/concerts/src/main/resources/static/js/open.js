function openclose(foo) {
    var s = '#' + foo;
    if(document.getElementById(foo).classList.contains("d-none")){
        $(s).removeClass("d-none");
        $(s).addClass("d-block");
        let element = document.getElementById('body');
        let element1 = document.getElementsByClassName('zatemnenie')
        for(var q=0;q<element1.length; ++q)
            element1[q].style.height= element.offsetHeight + 'px';
    }
    else{
        $(s).removeClass("d-block");
        $(s).addClass("d-none");
        const collapseElem = document.getElementById('collapseExample' + foo);
        const collapse = new bootstrap.Collapse(collapseElem, {toggle: false});
        collapse.hide();

    }
}