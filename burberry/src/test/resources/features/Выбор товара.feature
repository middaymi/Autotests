# language: ru
  Функционал: Поиск товара на сайте burberry

    Сценарий: Поиск товара фирмы Kensington
      Допустим совершен переход на страницу "Главная Burberry" по ссылке из property файла "burberryPage"
      И в поле "Поиск" введено значение "Kensington"
      И выполнено нажатие на клавиатуре "Enter"
      Тогда страница "Главная Kensington" загрузилась
      И название товара записалось в переменную "onKensingtonProductTitle"
      Допустим выполнено нажатие на блок "Название товара"
      Когда страница "Детальная товара" загрузилась
      И название товара записалось в переменную "onDetailProductTitle"
      Тогда наименования товара, сохраненные в перемнных "onKensingtonProductTitle" и "onDetailProductTitle" совпадают
