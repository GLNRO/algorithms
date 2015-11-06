def next_prime(num)
  f = num +1
  until prime?(f)
    f+=1
  end
  f
end

def prime?(num)
  p = true
  (2..num/2).each {|x| p = false if num % x == 0}
  p
end

def largest_factor(n)
  factors = []
  f = 2
  until n == 1
    if n % f == 0
      factors << f
      n = n/f
    else
      f = next_prime(f)
    end
  end
  p factors.last
end

largest_factor(600851475143)