#### 자바스크립트 유용한 알고리즘 메소드 및 문법

1. forEach
   - for문과 같은 반복문을 수행하는 역할
   - index, 조건식, 증가문 필요없다. callback 함수로 기능 대체
   - throw를 발생시키지 않으면 중간에 반복을 종료할 수 없다

```js
/*
    function(currentValue, index, arr) - 배열의 각 항목에 대해 실행할 함수
    currentValue - 배열의 값
    index(선택사항) - 현재 항목의 인덱스
    arr(선택사항) - 현재 항목의 배열
*/
array.forEach(function(currentValue, index, arr));

// 사용 1
const array = [0,1,2,3];
array.forEach(element => console.log(array));

// 사용 2
let map = new Map();
map.set('name', 'John');
map.set('age', '30');

map.forEach((value, key) => console.log)

```

2. map
   - callback 함수의 조건으로 배열 안의 요소들을 일괄적으로 변경 후 배열을 새로 생성한다.
   - 배열을 1:1 매핑하지만 기존 객체를 수정하지 않는다.

```js
// element 인수만 사용해도 돌아간다
arr.map(function (element, index, array) {}, this);

// 사용 1
let users = [
  { firstName: "susan", lastName: "steward" },
  { firstName: "jacob", lastName: "black" },
];
let userFullnames = users.map(function (element) {
  return `${element.firstName} ${element.lastName}`;
});
```

3. filter
   - callback 함수의 조건에 해당하는 모든 요소가 있는 배열을 새로 생성한다.

```js
const data = [
  { name: "루피", age: 26 },
  { name: "지우", age: 20 },
  { name: "포비", age: 20 },
];
const result = data.filter((x) => {
  return (x.age = 26);
});
```

4. split
   - 특정 문자를 기준으로 문자열을 구분하여 배열로 만들어 반환한다.

```js
const str = "this is me";
const str2 = str.split(" ");
```

5. substr
   - 문자열에서 특정부분을 잘라내서 반환한다.

```js
// 두번째 매개변수가 없으면 문자열의 끝까지 자름
substr(시작 포지션, 길이);
//사용 1
const str = 'abcdefg';
const str2 = str.substr(1, 3);
```
