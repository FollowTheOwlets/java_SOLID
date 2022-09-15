# Задача Магазин

### Магические числа: 
https://github.com/FollowTheOwlets/java_SOLID/blob/d07a1ff65d17ba0985fca3c00ca61ff9673aeb41/src/shop/viewer/Viewer.java#L40-L53

### DRY
https://github.com/FollowTheOwlets/java_SOLID/blob/d07a1ff65d17ba0985fca3c00ca61ff9673aeb41/src/shop/console_manager/ConsoleManager.java#L10-L19

### Single Responsibility Principle 
* Разделение обязанностей между Viewer
https://github.com/FollowTheOwlets/java_SOLID/blob/d07a1ff65d17ba0985fca3c00ca61ff9673aeb41/src/shop/viewer/Viewer.java#L9
и ConsoleManager
https://github.com/FollowTheOwlets/java_SOLID/blob/d07a1ff65d17ba0985fca3c00ca61ff9673aeb41/src/shop/console_manager/ConsoleManager.java#L7

### Liskov substitution principle
* Я не наследовал Cart
https://github.com/FollowTheOwlets/java_SOLID/blob/d07a1ff65d17ba0985fca3c00ca61ff9673aeb41/src/shop/product_list/cart/Cart.java#L14
от ProductList 
https://github.com/FollowTheOwlets/java_SOLID/blob/d07a1ff65d17ba0985fca3c00ca61ff9673aeb41/src/shop/product_list/ProductList.java#L9

### Interface segregation principle
* Использовал мелкие интерфейсы вместо одного глобального в Cart
https://github.com/FollowTheOwlets/java_SOLID/blob/d07a1ff65d17ba0985fca3c00ca61ff9673aeb41/src/shop/product_list/cart/Cart.java#L14
и в ProductList 
https://github.com/FollowTheOwlets/java_SOLID/blob/d07a1ff65d17ba0985fca3c00ca61ff9673aeb41/src/shop/product_list/ProductList.java#L9

### Dependency inversion principle
* Viewer работает со списком продуктов не вникая, это список для продажи (ProductList) илил список в корзине (Cart)
https://github.com/FollowTheOwlets/java_SOLID/blob/d07a1ff65d17ba0985fca3c00ca61ff9673aeb41/src/shop/viewer/Viewer.java#L40-L53

