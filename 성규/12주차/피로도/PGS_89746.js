// /*
// 내림차순 정렬해서 성공하면 카운트++
// 근데 이렇게 풀면 입출력 예1과 같은 결과값으로 나옴 dfs로 해야되나봄
// */
// function solution(k, dungeons) {
//     let count = 0;
//     let remain = k;
//     dungeons.sort(function(a,b) {
//         return a-b;
//     });
//     dungeons.map((item) => {
//         const [need, consume] = item; // 구조분해할당
//         if(remain >= need){
//             remain = remain - consume;
//             console.log(remain);
//             count++;
//         }
//     })
//     return count;

// }
function solution(k, dungeons) {
  let max_count = 0;

  // dfs 로 피로도가 최소 피로도 이상일 때만 던전 계속해서 방문
  // 더 방문할 수 없게 되면 현재까지 방문한 던전 개수를 비교
  const dfs = (fatigue, count, visited) => {
    let isEnd = true;
    for (let i = 0; i < dungeons.length; i++) {
      if (visited[i] || dungeons[i][0] > fatigue) {
        continue;
      }
      isEnd = false;
      visited[i] = true;
      dfs(fatigue - dungeons[i][1], count + 1, visited);
      visited[i] = false;
    }
    if (isEnd) {
      max_count = Math.max(max_count, count);
    }
  };
  dfs(k, 0, Array(dungeons.length).fill(false));
  return max_count;
}
