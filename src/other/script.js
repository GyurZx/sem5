

let currentImageIndex = 0;

function changeImage() {
    const bannerContainer = document.querySelector(".banner-container");
    bannerContainer.style.backgroundImage = `url(${images[currentImageIndex]})`;
}

function nextImage() {
    currentImageIndex++;
    if (currentImageIndex >= images.length) {
        currentImageIndex = 0;
    }
    changeImage();
}

function prevImage() {
    currentImageIndex--;
    if (currentImageIndex < 0) {
        currentImageIndex = images.length - 1;
    }
    changeImage();
}

setInterval(nextImage, 5000);

const prevButton = document.querySelector(".prev-button");
prevButton.addEventListener("click", prevImage);

const nextButton = document.querySelector(".next-button");
nextButton.addEventListener("click", nextImage);