
    function AddToCartBtn() {

    }

    function addToCart(productName) {
    let cart = localStorage.getItem('cart');

    if (!cart) {
    cart = [];
} else {
    cart = JSON.parse(cart);
}

    cart.push({ name: productName });
    localStorage.setItem('cart', JSON.stringify(cart));

    alert('Товар успешно добавлен в корзину!');
    updateCartView();
}

    function updateCartView() {
    const cartInfo = document.getElementById('cart-info');
    cartInfo.innerHTML = '';

    let cartItems = localStorage.getItem('cart');

    if (!cartItems) {
    cartItems = [];
} else {
    cartItems = JSON.parse(cartItems);
}

    if (cartItems.length === 0) {
    cartInfo.innerText = 'Корзина пуста';
} else {
    cartItems.forEach(item => {
    const newCartItem = document.createElement('div');
    newCartItem.innerText = `Добавлен товар: ${item.name}`;
    cartInfo.appendChild(newCartItem);
});
}
}

    const addToCartButtons = document.querySelectorAll('.AddToCartBtn');

    addToCartButtons.forEach(button => {
    button.addEventListener('click', function() {
        const productName = this.parentNode.querySelector('h4').innerText;

        addToCart(productName);
    });
});

    window.onload = function() {
    updateCartView();
};



