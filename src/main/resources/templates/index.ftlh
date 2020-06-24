<#import "main.ftlh" as main>
<@main.main>
    <main class="main">
        <div class="container">
            <section class="promo">
                <h1 class="promo-title">Онлайн-сервис <br/>доставки еды на дом</h1>
                <p class="promo-text">
                    Блюда из Вашего любимого ресторана привезет курьер в перчатках, маске и с антисептиком!
                </p>
            </section>
            <section class="restaurants">
                <div class="section-heading">
                    <h2 class="section-tittle">Рестораны</h2>
                    <form>
                        <input type="text" class="input input-search" placeholder="Поиск блюд в ресторане" name="search">
                    </form>
                </div>
                <div class="cards">
                        <#list categories as category>
                            <div class="card">
                                <img src="img\cards\${category.image}" alt="card" class="card-image">
                                <div class="info">
                                    <div class="title">
                                        <div class="name-post">${category.title}</div>
                                        <div class="time">${category.time}</div>
                                    </div>
                                    <div class="about">
                                        <div class="rating">
                                            <img src="img\rating.svg" alt="rat" class="rating-image">
                                            <span class="span-rating">${category.rating}</span>
                                        </div>
                                        <div class="characters">
                                            <div class="price">${category.price}</div>
                                            <div class="category">${category.description}</div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </#list>
                </div>
            </section>
        </div>
    </main>
</@main.main>