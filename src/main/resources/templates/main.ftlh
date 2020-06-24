<#macro main>
    <!DOCTYPE html>
    <html lang="ru">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Delivery Food - Доставка еды на</title>
        <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="css/normalize.css">
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
    <!-- Ctrl + / -->
    <div class="container">
        <header class="header">
            <a href="/">
                <img src="img\logo.svg" alt="Logo" class="logo">
            </a>
            <input type="text" class="input input-address" placeholder="Адрес доставки">
            <div class="buttons">
                <button class="button button-primary">
                    <img src="img/user.svg" alt="user" class="button-icon"/>
                    <span class="button-text"><a href="/login" class="button-text">Войти</a></span>
                </button>
                <button class="button" id="card-button">
                    <img src="img/shopping-cart.svg" alt="shopping-cart" class="button-icon">
                    <span class="button-text">Корзина</span>
                </button>
            </div>
        </header>
    </div>
    <#nested>
    <div class="container">
        <footer class="footer">
            <img src="img\logo.svg" alt="Logo" class="logo">
            <div class="footlinks">
                <div class="links">
                    <a href="/restourants.html" class="link">Ресторанам</a>
                    <a href="/couriers.html" class="link">Курьерам</a>
                    <a href="/press-center.html" class="link">Прес-центр</a>
                    <a href="/contacts.html" class="link">Контакты</a>
                </div>
                <div class="sites">
                    <div class="site">
                        <a href="https://instagram.com"><img src="/img/inst.svg" alt="inst"></a>
                    </div>
                    <div class="site">
                        <a href="https://facebook.com"><img src="/img/facebook.svg" alt="facebook"></a>
                    </div>
                    <div class="site">
                        <a href="https://vk.com"><img src="/img/vk.svg" alt="vk"></a>
                    </div>
                </div>
            </div>
        </footer>
    </div>
    <div class="modal">
        <div class="modal-dialog">
            <div class="modal-header">
                <h3 class="modal-tittle">Корзина</h3>
                <button class="close">&times;</button>
            </div>
            <div class="modal-body">
                <div class="food-row">
                    <span class="food-name">Ролл угорь стандарт</span>
                    <strong class="food-price">250$</strong>
                    <div class="food-counter">
                        <button class="counter-button">+</button>
                        <span class="counter">1</span>
                        <button class="counter-button">-</button>
                    </div>
                </div>
                <div class="food-row">
                    <span class="food-name">Ролл угорь стандарт</span>
                    <strong class="food-price">250$</strong>
                    <div class="food-counter">
                        <button class="counter-button">+</button>
                        <span class="counter">1</span>
                        <button class="counter-button">-</button>
                    </div>
                </div>
                <div class="food-row">
                    <span class="food-name">Ролл угорь стандарт</span>
                    <strong class="food-price">250$</strong>
                    <div class="food-counter">
                        <button class="counter-button">+</button>
                        <span class="counter">1</span>
                        <button class="counter-button">-</button>
                    </div>
                </div>
                <div class="food-row">
                    <span class="food-name">Ролл угорь стандарт</span>
                    <strong class="food-price">250$</strong>
                    <div class="food-counter">
                        <button class="counter-button">+</button>
                        <span class="counter">1</span>
                        <button class="counter-button">-</button>
                    </div>
                </div>
                <div class="food-row">
                    <span class="food-name">Ролл угорь стандарт</span>
                    <strong class="food-price">250$</strong>
                    <div class="food-counter">
                        <button class="counter-button">+</button>
                        <span class="counter">1</span>
                        <button class="counter-button">-</button>
                    </div>
                </div>

            </div>
            <div class="modal-footer">
                <span class="pricetag">1542</span>
                <div class="footer-buttons">
                    <button class="button button-primary">Оформить заказ</button>
                    <button class="button">Отмена</button>
                </div>
            </div>
        </div>
    </div>
    <script src="js/main.js"></script>
    </body>
    </html>
</#macro>
