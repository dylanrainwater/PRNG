# PRNG

A psuedorandom number generator written in Java.

## How it works

PRNG uses the [Middle-Square method](https://en.wikipedia.org/wiki/Middle-square_method) to generate a psuedorandom number. This method is not good because it begins returning the same number very quickly, or in other words it has a very short *period*. 

The algorithm works like so:

1.  Take some seed as input to the PRNG class
2.  Square the seed.
3.  Find the middle of seed<sup>2</sup>, this is your random number.
