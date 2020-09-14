# Interview Problem Solving

Sample Questions usually presented during interviews to check your problem solving skills. 

![Gradle Run](https://github.com/tiarebalbi/interview-problem-solving/workflows/Gradle%20Run/badge.svg)
[![Maintainability](https://api.codeclimate.com/v1/badges/26736da8025b65f457f4/maintainability)](https://codeclimate.com/github/tiarebalbi/interview-problem-solving/maintainability)
---

## The Two Egg Problem

### A building has 100 floors. One of the floors is the highest floor an egg can be dropped from without breaking.

If an egg is dropped from above that floor, it will break. If it is dropped from that floor or below, it will be completely undamaged and you can drop the egg again.
Given two eggs, find the highest floor an egg can be dropped from without breaking, with as few drops as possible.

[Source Code](https://github.com/tiarebalbi/interview-problem-solving/blob/master/src/main/kotlin/com/tiarebalbi/interview/problem1)

#### Output:

    2018-11-07 08:01:21 INFO  TwoEggProblem:29 - Highest floor an egg won't break from: 13
    2018-11-07 08:01:21 INFO  TwoEggProblem:30 - Floors we drop first egg from: [50]
    2018-11-07 08:01:21 INFO  TwoEggProblem:31 - Floors we drop second egg from: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
    2018-11-07 08:01:21 INFO  TwoEggProblem:32 - Total number of drops: 13
    2018-11-07 08:01:21 INFO  TwoEggProblem:29 - Highest floor an egg won't break from: 98
    2018-11-07 08:01:21 INFO  TwoEggProblem:30 - Floors we drop first egg from: [50, 75, 88, 94, 97]
    2018-11-07 08:01:21 INFO  TwoEggProblem:31 - Floors we drop second egg from: []
    2018-11-07 08:01:21 INFO  TwoEggProblem:32 - Total number of drops: 5 

---

## The Cake Thief

### You are a renowned thief who has recently switched from stealing precious metals to stealing cakes because of the insane profit margins. You end up hitting the jackpot, breaking into the world’s largest privately owned stock of cakes—the vault of the Queen of England.

While Queen Elizabeth has a limited number of types of cake, she has an unlimited supply of each type. 

Each type of cake has a weight and a value, stored in an object with two properties:

1. `weight` : the weight of the cake in kilograms
2. `worth` : the monetary value of the cake in British pounds

You brought a duffel bag that can hold limited weight, and you want to make off with the most valuable haul possible.

Write a function maxDuffelBagValue() that takes an array of cake type objects and a weight capacity, and returns the maximum monetary value the duffel bag can hold.

[Source Code](https://github.com/tiarebalbi/interview-problem-solving/blob/master/src/main/kotlin/com/tiarebalbi/interview/problem2)

#### Output:

    2018-11-07 11:25:09 INFO  TheCakeThief:44 - maxDuffelBagValue: 555 with a capacity of 20 with cakes [Cake(weight=7, worth=160), Cake(weight=3, worth=90), Cake(weight=2, worth=15)]
    2018-11-07 11:25:09 INFO  TheCakeThief:44 - maxDuffelBagValue: 3000 with a capacity of 100 with cakes [Cake(weight=1, worth=30), Cake(weight=50, worth=200)]
    2018-11-07 11:25:09 INFO  TheCakeThief:44 - maxDuffelBagValue: 110 with a capacity of 8 with cakes [Cake(weight=3, worth=40), Cake(weight=5, worth=70)]
    2018-11-07 11:25:09 INFO  TheCakeThief:44 - maxDuffelBagValue: 120 with a capacity of 9 with cakes [Cake(weight=3, worth=40), Cake(weight=5, worth=70)]
     
---
