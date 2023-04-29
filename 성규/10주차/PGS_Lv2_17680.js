function solution(cacheSize, cities) {
  let answer = 0;
  let cache = [];

  cities = cities.map((item) => item.toLowerCase());
  if (cacheSize === 0) {
    answer = cities.length * 5;
    return answer;
  }
  for (let i = 0; i < cities.length; i++) {
    if (!cache.includes(cities[i])) {
      answer += 5;
      cache.push(cities[i]);
      if (cache.length > cacheSize) cache.shift();
    } else {
      answer++;
      let index = cache.indexOf(cities[i]);
      cache.splice(index, 1);
      cache.push(cities[i]);
    }
  }

  return answer;
}
