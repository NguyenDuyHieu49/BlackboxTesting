# Danh sách test case

## Rectangle
- perimeter(2,3) => 10 (normal)
- area(2,3) => 6 (normal)
- area(-1,2) => IllegalArgumentException (biên)

## Quadratic
- solve(1,-3,2) => [1,2] (delta>0)
- solve(1,2,1) => [-1] (delta==0)
- solve(1,0,1) => [] (delta<0)
- solve(0,2,1) => IllegalArgumentException (a==0)

## MonthDays
- daysInMonth(1,2021) => 31
- daysInMonth(4,2021) => 30
- daysInMonth(2,2019) => 28
- daysInMonth(2,2020) => 29
- daysInMonth(0,2020) => IllegalArgumentException
- daysInMonth(1,0) => IllegalArgumentException

## PrimeCheck
- isPrime(0) => false
- isPrime(1) => false
- isPrime(2) => true
- isPrime(97) => true
- isPrime(9) => false

## AlternatingSum
- compute(1) => 1
- compute(2) => -1
- compute(3) => 2
- compute(0) => IllegalArgumentException

## GCD
- gcd(54,24) => 6
- gcd(-54,24) => 6
- gcd(0,5) => 5
- gcd(0,0) => IllegalArgumentException

## FactorialSum
- sumFactorials(0) => 0
- sumFactorials(1) => 1
- sumFactorials(2) => 3
- sumFactorials(3) => 9
- sumFactorials(-1) => IllegalArgumentException
