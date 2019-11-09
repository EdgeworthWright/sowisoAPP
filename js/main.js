document.getElementsByClassName('theLogo')[0].onclick = () => {
    document.getElementsByClassName('container')[0].style.gridTemplateColumns = "6% auto";
    for (let i = 0; i < document.getElementsByClassName('link--text').length; i++) {
        document.getElementsByClassName('link--text')[i].style.display = 'none';
        document.getElementsByClassName('smallNavImage')[i].style.display = 'block';
    }
    document.getElementById('current').style.width = '84%';
    document.getElementsByClassName('theLogo')[0].style.display = 'none';
    document.getElementsByClassName('logo')[0].style.border = 'none';
    document.getElementsByClassName('logo')[0].style.background = '#0000001A';
    document.getElementById('copyright').style.display = 'none';
    document.getElementsByClassName('hamburger')[0].style.display = "initial";
}

document.getElementsByClassName('hamburger')[0].onclick = () => {
    document.getElementsByClassName('container')[0].style.gridTemplateColumns = "15% auto";
    for (let i = 0; i < document.getElementsByClassName('link--text').length; i++) {
        document.getElementsByClassName('link--text')[i].style.display = 'initial';
        document.getElementsByClassName('smallNavImage')[i].style.display = 'none';
    }
    document.getElementById('current').style.width = '94%';
    document.getElementsByClassName('theLogo')[0].style.display = 'initial';
    document.getElementsByClassName('logo')[0].style.border = '1px solid #A39EFE';
    document.getElementsByClassName('logo')[0].style.background = '#FFFFFF';
    document.getElementById('copyright').style.display = 'initial';
    document.getElementsByClassName('hamburger')[0].style.display = "none";
}


let closeButton = document.getElementById('closeAd');

closeAd.onclick = () => {
    document.getElementsByClassName('adCorner')[0].style.display = 'none';
}