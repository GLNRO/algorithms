def even_fib_sum
  x = 1
  y = 1
  sum = 0
  i = 0
  while i < 4000000
    i = x + y
    sum += i if i%2==0
    x = y
    y = i
  end
  p sum
end

even_fib_sum