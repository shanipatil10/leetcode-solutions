Problem Statement

You have numBottles full water bottles and a recycling system where numExchange empty bottles can be exchanged for one full bottle.

Return the maximum number of water bottles you can drink.


Approach

Start with the initial number of bottles (ans = numBottles).

While the number of bottles is enough to exchange (numBottles >= numExchange):

Calculate new full bottles: quotient = numBottles / numExchange

Calculate remaining bottles: remainder = numBottles % numExchange

Update total bottles drunk: ans += quotient

Update bottles for next iteration: numBottles = quotient + remainder

Return the total bottles drunk (ans).

Complexity

Time Complexity: O(log n) — each iteration reduces the number of bottles.

Space Complexity: O(1) — only a few integer variables used.
