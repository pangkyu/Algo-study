/*
1. 명함에 다 넣기 위해서는 가로와 세로값이 다른 값들을 다 포함할 수 있어야한다. 
2. 가로와 세로는 눕혀서 수납할 수 있다(값변경이 가능하다)
3. 따라서, 가로와 세로에서 큰 값을 한쪽으로 몰아 max값끼리 곱하면 결과가 나온다
*/
function solution(sizes) {
  const weight = [];
  const height = [];

  sizes.map((item) => {
    const [w, h] = item;
    if (w > h) {
      weight.push(w);
      height.push(h);
    } else {
      weight.push(h);
      height.push(w);
    }
  });
  return Math.max.apply(null, weight) * Math.max.apply(null, height);
}
