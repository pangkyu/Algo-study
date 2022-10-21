/**
 * 두 개 뽑아서 더하기
문제 설명
정수 배열 numbers가 주어집니다. numbers에서 서로 
다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.

제한사항
numbers의 길이는 2 이상 100 이하입니다.
numbers의 모든 수는 0 이상 100 이하입니다.

입출력 예 #2

2 = 0 + 2 입니다.
5 = 5 + 0 입니다.
7 = 0 + 7 = 5 + 2 입니다.
9 = 2 + 7 입니다.
12 = 5 + 7 입니다.
따라서 [2,5,7,9,12] 를 return 해야 합니다.
 */

function solution(numbers) {
  let answer = [];
  for (let i = 0; i < numbers.length; i++) {
    for (let j = i + 1; j < numbers.length; j++) {
      answer.push(numbers[i] + numbers[j]);
    }
  }
  answer = answer.filter((element, index) => answer.indexOf(element) === index);
  return answer.sort(function (a, b) {
    return a - b;
  });
}

//sort 가 아스키 문자 순서로 정렬되어 있어서 숫자의 크기대로 나오지 않음

/**
 * .sort(function(a,b){
 *  return a - b;  -> 오름차순으로 출력 
 *  retrun b - a; -> 내림차순으로 출력 
 * })
 * 

 */
