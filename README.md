## SpringConfigCandy
Create a new class with multiple fields. Some fields must be set using the constructor, some using the setter method, and some using the init method, which you must specify when you declare the bean in the configuration. Transform the XML configuration into a Java configuration. Create a Map bean in the XML configuration.
## 8. Spring 2. Впровадження залежностей та IoC контейнер
## Завдання 2

Створіть новий клас із будь-якої предметної області з кількома полями. Деякі поля мають бути задані за допомогою конструктора, деякі – за допомогою setter-методу, а деякі – за допомогою методу init, який ви маєте вказати під час оголошення біну в конфігурації.

## Завдання 3

Переведіть конфігурацію XML із Завдання 2 у конфігурацію Java.

## Завдання 4

За аналогією з List з уроку створіть у конфігурації XML бін Map.

## Заметки

### init-method

init-method - это атрибут, который может быть использован в конфигурации Spring для указания имени метода, который должен быть вызван после того, как бин будет создан и настроен. Этот метод может использоваться для выполнения дополнительной инициализации или настройки бина.

В Spring-конфигурации, мы можем использовать тег <bean> для создания бина. Затем мы можем указать init-method для указания имени метода, который будет вызван после создания бина. Например:
  
 ```
  <bean id="candy1" class="candies.impl.Candy" init-method="init">
        <property name="weight" value="10" />
        <property name="price" value="5.00" />
        <constructor-arg name="name" value="Slivki-Linivki" />
        <constructor-arg name="type" value="waffle"  />
 ```
    
    
