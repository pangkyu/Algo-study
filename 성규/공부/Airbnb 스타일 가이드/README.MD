### 참고

- https://github.com/ParkSB/javascript-style-guide#variables--no-chain-assignment

### 참고해서 사용할 스타일 가이드

##### 객체(Objects)

- 객체를 생성할 대는 리터럴 문법으로

```js
    const item = new Object(); // bad
    const item = {}; // good

    // 프로퍼티와 동일한 이름의 변수로 값을 설정하고 싶을 때
    const age = 20
    let jhon = {
        name : 'Jhon Doe',
        // age : age로 설정안해도 됨
        age

        [field.toLowerCase()] : 20 // 연산 결과를 객체 리터럴로 사용하고 싶을때는 대괄호
    }
```
