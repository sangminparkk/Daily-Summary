# String Methods

## 문자열 메서드
* String 클래스에는 문자열에 사용할 수 있는 내장 메서드가 있습니다.

### format()
* 불필요한 문자열 결합없이 `가독성`을 높여 원하는 형태로 formatting된 `하나의 문자열`로 출력이 가능하다.
* `%`를 붙여 지정된 서식에 따라 작성하면 된다.
* flag(0/-/+) 조건을 설정하여 공백을 채울 수 있다.

```
System.out.println(String.format("구입 상품 : %s, 가격 : %d, 수량 : %d", "바나나", 4000, 1));

System.out.println(String.format("%-5d", 123)); // 123(공백)(공백)
System.out.println(String.format("%05d", 123)); // 00123
```

.
.