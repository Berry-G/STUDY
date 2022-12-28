'''
    1. 인공지능 : 인간처럼 학습하고 추론하는 프로그램 연구
       머신러닝 : 인공지능의 한 분야. 스스로 학습하는 프로그램 연구
                    - 통계학과 달리 보톹ㅇ 대량의 복잡한 데이터셋을 다루기 때문에
                      전통적인 통계분석 방법은 현실적으로 적용하기 힘듦
                    - 특히 딥러닝은 수학적 이론이 비교적 부족하고 근본적으로 엔지니어링 분야에 해당
                    - 경험적 발견에 의해 주도되는 실천적인 분야이므로 소프트웨어 및 하드웨어 발전에 크게 의존함.

       딥러닝(deep learning) : 인공신경망을 사용하여 빅데이터로부터 학습하는 프로그램 연구
        1) 신경망 (neural network)d은 1950년대부터 연구됨
            - 딥러닝의 기원은 인공신경망
                - 뇌에 수만흔 뉴런(신경)이 존재하고 그 뉴런들은 시냅스로 연결되어 있는데,
                  이를 신경망 (neural network)이라고 부름
        2) 최근의 인공지능 붐은 전적으로 딥러닝의 성공 덕
        3) 많은 레이어(layer)가 있는 신경 회로망을 사용하여 빅데이터의 추상화를 모델링하는 기계학습의 한 분야

    2. 인공지능 역사
        1) 탐색의 시대
        2) 지식의 시대
        3) 학습의 시대
            - AI의 부활
            - 자율 주행 자동차
            - 광고 (추천 시스템)
            - 챗봇
            - 의료분야, 진단
            - 언어 번역(자연어 처리)
            - 경영 분야(빅데이터 -> 인공지능 -> 경영의사결정)
            - 딥러닝 예술(화풍 모방)
            - 음악
    3. 신경망
        1) 인공 신경망(artificial neural network : ANN)
            - 생물학적인 신경망에서 영감을 받아서 만들어진 컴퓨팅 구조
                - 인간의 뇌 구조 모방
            - 장점
                - 학습 가능 : 데이터가 주어지면 신경망은 배울 수 있음
                - 몇 개의 소자가 오동작하더라도 전체적으로 큰 문제가 발생하지 않음
    4. 퍼셉트론(perceptron) 등장
        1) 생물학적 뉴런을 모방하여 만든 인공신경망의 기본 단위
            - 이전 perceptron과 연결 =>  inputs     weights     input function    activation function     output => 다음 perceptron 으로 전달
            - 입력 ---> 모두 더함 ---> 함수 ----> 출력
            - 딥러닝은 가중치 (Wn)을 수정하는 행위
            - 뇌세포는 항상 일정한 크기의 값을 출력함 (0 or 1)
            - 뇌세포의 출력물은 디지털 신호로 간주할 수 있음

        2) activation function(활성화 함수)
            - 입력 신호의 가중치의 합이 어떤 임계값을 넘는 경우에만 뉴런이 활성화되어서 1을 출력
              그렇지 않으면 0을 출력함
            - if (w1x1 + w2x2 + b >= 1)==> 1
              otherwise ==> 0
            - 계단(step) 함수
            - 시그모이드 함수 : 가장 무난한 형태로 널리 활용됨
            - 하이퍼볼릭 탄젠트 함수 : 최근 음수값을 사용하지 않으려는 추세로 선호도 감소
            - 렐루 함수 : 딥러닝 성능을 크게 향상시키는 경향이 있어 널리 활용됨
            - 리키 렐루 함수 : 음수값 정보가 일부 보전되어, 렐루보다 성능이 뛰어남

            출력 계산 예 )
                - 입력값 = (1,2,3,4,5)
                - 가중치 = (0.1, 0.2, 0.5, 0.6, 0.1)
                - 가중치 적용된 입력값 = 1*0.1 + 2*0.2+3*0.5+4*0.6 +5*0.1
                                   = 4.9


        3) 퍼셉트론의 논리 연산
            x1      x2      y (X1 and X2)     y (X1 or X2)      y(X1 XOR X2)
            0       0       0                 0                 0
            0       1       0                 1                 1
            1       0       0                 1                 1
            1       1       1                 1                 0
        4) and / or 연산
            - 초기 퍼셉트론을 이용한 문제해결은 AND 와 OR 같은 간단한 연산이었음
                - 기계가 AND와 OR연산을 스스로 풀 수 있으면 이를 조합해 어떤 문제든 풀어낼 수 있다고 생각했음
            - 각 표본의 입력에 대한 출력값을 XY 평면에 표시
            - 서로 다른 두 그룹을 구분하기 위해 선형분류자 1개 필요
                - 퍼셉트론을 통한 선형 분리가 가능한 것을 확인

        5) XOR 연산
            - 기존의 퍼센트론으로는 XOR 연산이 절대 불가능하다는 가설을 수학적으로 증명(1969)
            - 하나의 선형 분류자로 두 그룹을 분류 불가
            - 퍼셉트론을 여러 개 쌓아 올린 다층 퍼셉트론 (MLP) 를 통해 XOR에 대한 문제 해결
            - 각각의 가중치(Weight)와 편향(Bias)을 학습시킬 방법의 한계 언급 → 침체기를 맞이함
'''
import numpy as np
epsilon = 0.0000001          # 부동소수점 오차를 방지하기 위함
def perceptron (x1, x2):
    w1, w2, b = 1.0, 1.0, -1.5
    sum_ = w1 * x1 + w2 * x2 +b
    if sum_ > epsilon:
        return 1
    else:
        return 0

print(perceptron(0,0))
print(perceptron(0,1))
print(perceptron(1,0))
print(perceptron(1,1))


