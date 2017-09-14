# Fractal [![BCH compliance](https://bettercodehub.com/edge/badge/namila007/Fractal?branch=master)](https://bettercodehub.com/) [![Build Status](https://travis-ci.org/namila007/Fractal.svg?branch=master)](https://travis-ci.org/namila007/Fractal)

Can create Mandelbrot and Julia fractals


Run>
'java Fractal -h'  for help.default mandelbrot is set.

![screenshot_2](https://user-images.githubusercontent.com/18147085/30410903-6daeda88-992b-11e7-8570-5ea1fcdd7f0e.jpg)
![screenshot_3](https://user-images.githubusercontent.com/18147085/30410906-70c460da-992b-11e7-911d-a38e48dcf6e6.jpg)

## Madelbrot set:
You should be able to set the iterations and the region of interest from the command-line by passing
arguments; java Fractal Mandelbrot -0.5 0.5 -0.1 1 1000 means the region of interest for the image
should be from -0.5<real<0.5 and -0.1<complex<1 and for each point you need to do 1000 iterations
before deciding that it is in the set. Note that Fractal is the name of the application.
## The Julia set:
 If one types; java Fractal Julia -0.5 0.156 1000 then you should plot the Julia set for C = -0.5 +
0.156i with 1000 iterations for each point. You may take the region of interest in the complex plan as 1
< real part < 1 and -1< complex part<1 which cannot be modified. 

## Program: 
Your program should accept arguments; at least one which would specify what set to plot. If
the set selected is Mandelbrot the user should give either 0, 4 or 5 arguments. If there are 0 arguments
then use the default values as specified in the table below. 4 arguments will be the region of interest in
the complex plane and the 5th one is the number of iterations to do for a point.
For the Julia set the user should give 0 or 2 arguments. If there are no arguments one should use the
default arguments and 2 arguments will be the real and complex part for C.

|Item| Default value| Note|
|---|---|---|
|Region of interest |-1<real<1 -1<complex<1 |Always use default for Julia|
|Number of iterations| 1000| |
|C |-0.4+0.6i |Only for Julia set|
