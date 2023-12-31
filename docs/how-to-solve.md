### 미션 해결 전략 
#### 1. 본인이 이해하고 구현한 내용에 기반해 '다른 근무자와 순서를 바꿔야 하는 경우'를 자신만의 예시를 들어 설명하세요. (필수)       
- 연속 2틀 째 근무일이 평일에 해당할 경우
  - 2틀 째 근무하는 근무자의 다음 순번과 순서를 바꾼다.
```angular2html
평일 순번: 준팍,도밥,수아,루루,글로,솔로스타,우코,슬링키,참새,도리,고니
휴일 순번: 수아,루루,글로,솔로스타,우코,슬링키,참새,도리,준팍,도밥,고니
```
위 경우에서 시작 월,일이 5월, 월요일 이라고 가정했을 때
5월 1일 준팍(월요일), 5월 2일 도밥(화요일), 5월 3일 수아(수요일), 5월 4일 루루(목요일),
5월 5일 수아(금요일) 공휴일, 5월 6일 루루(토요일) 휴일, 5월 6일 글로(일요일) 휴일 ~
이때 5월 7일 월요일인 평일에 글로가 또 근무를 서게 된다.
그러므로 글로의 다음 평일 순번인 솔로스타와 순번을 교체한다.
5월 7일 솔로스타(월요일), 5월 8일 글로(화요일)

- 연속 2틀 쨰 근무일이 휴일에 해당할 경우
  - 2틀 째 근무하는 근무자의 다음 순번과 순서를 바꾼다.
```angular2html
평일 순번: 준팍,도밥,고니,수아,루루,글로,솔로스타,우코,슬링키,참새,도리
휴일 순번: 수아,루루,글로,솔로스타,우코,슬링키,참새,도리,준팍,도밥,고니
```
위 경우에서 시작 월,일이 5월, 월요일 이라고 가정했을 때
5월 1일 준팍(월요일), 5월 2일 도밥(화요일), 5월 3일 고니(수요일), 5월 4일 수아(목요일) ~
5월 5일은 공휴일로 휴일 순번인 첫번째인 수아가 근무를 해야하는데 전날 이미 근무를 섰으므로
수아의 다음 순번인 루루와 순번을 다음과 같이 교체한다.
5월 5일 루루(금요일) 공휴일, 5월 6일 수아(토요일) 휴일

#### 2. 요구사항에서 제시한 앞의 날짜부터 순서를 변경하는 방법 외에 다른 방법이 있다면 어떤 방식이 있는지, 이 방법은 기존에 제시된 방식과 비교해 어떤 차이가 있는지 설명하세요. (선택)
