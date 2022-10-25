/**
 * JadenCase 문자열 만들기
문제 설명
JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다. 단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 됩니다. (첫 번째 입출력 예 참고)
문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.

제한 조건
s는 길이 1 이상 200 이하인 문자열입니다.
s는 알파벳과 숫자, 공백문자(" ")로 이루어져 있습니다.
숫자는 단어의 첫 문자로만 나옵니다.
숫자로만 이루어진 단어는 없습니다.
공백문자가 연속해서 나올 수 있습니다.
 */

function solution(s) {
  const words = s
    .split(" ")
    .map(
      (word) => word.substr(0, 1).toUpperCase() + word.substr(1).toLowerCase()
    );

  return words.join(" ");
}

/**
 *    처음 푼 방법 -> 근데 첫글자 다음에 있는거를 소문자로도 바꿔줬어야했는데 해당 부분 생각못하고 풀었음 
 *    ===> 그래서 위에 문제처럼 띄어쓰기 기준으로 문자열을 잘라서 map으로 돌아서 0,1 부분만 어퍼케이스하고 나머지는 로우케이스로 변환시켜서 조인으로 합쳤다 
 *    let jadenCase = s.replace(/\b[a-z]/g, char => char.toUpperCase());
      
      return jadenCase;
 * 
 * 
 */
