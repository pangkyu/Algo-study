/*
dfs를 정수의 개수만큼 재귀호출하여 각각의 인덱스의 수를 더했을 때, 뺐을 때의 모든 경우의 수를 구함 
index가 numbers의 길이와 같을때 
  sum값이 타겟값과 같다면 answer++ 
아니라면 얼리리턴 
dfs에 인덱스를 1더하고, sum값에 sum에 numbers[index]를 + 혹은 - 한 값을 재귀호출한다 
*/
function solution(numbers, target) {
  let answer = 0;

  function dfs(index, sum) {
    if (index === numbers.length) {
      if (sum === target) {
        answer++;
      }
      return;
    }

    dfs(index + 1, sum + numbers[index]);
    dfs(index + 1, sum - numbers[index]);
  }
  dfs(0, 0);
  return answer;
}
