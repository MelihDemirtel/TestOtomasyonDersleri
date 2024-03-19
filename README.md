# TestOtomasyonDersleri

## Locator Önceliği

1. id
2. cssSelector
3. xpath

### CSS SELECTOR ÖRNEKLERİ
```java
cdriver.findElement(By.cssSelector("label")); tagName

cdriver.findElement(By.cssSelector("#userEmail-label")); #id

cdriver.findElement(By.cssSelector(".form-label")); .className

cdriver.findElement(By.cssSelector("[type='text']")); [attribute='value']

cdriver.findElement(By.cssSelector("div input")); parent tagName

cdriver.findElement(By.cssSelector("input#userEmail")); tagName#id

cdriver.findElement(By.cssSelector("label.form-label")); tagName.className
```

### XPATH ÖRNEKLERİ
```java
cdriver.findElement(By.xpath("//label")); //tagName

cdriver.findElement(By.xpath("//input[@type='text']")); //tagName[@attribute='attribute value']

cdriver.findElement(By.xpath("//input[contains(@type,'text')]")); //tagName[contains(@attribute, 'attribute value')]

cdriver.findElement(By.xpath("//label[contains(text(),'Full')]")); //tagName[contains(text(), 'text value')]
        
cdriver.findElement(By.xpath("//label[text()='Full')]")); //tagName[text()='text value')]

cdriver.findElement(By.xpath("(//div[@class='element-group'])[5]")); //tagName[@attribute='attribute value')[index no]]

cdriver.findElement(By.xpath("//input[@placeholder='Full Name' and @type='text']")); //relative, and operator
```