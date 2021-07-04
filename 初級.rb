# age = gets.to_i

# if age % 400 == 0
#   p "閏年です"
# elsif age % 100 == 0
#   p "閏年ではない"
# elsif age % 4 == 0
#   p "閏年です"
# else
#   p "閏年ではない"
# end
# # 条件の記述順に注意する


# S = gets

# p S.chomp  #変数の後に改行が入る時は”chomp"で改行を削除できる


m = gets.to_i
p = gets.to_i
q = gets.to_i

s = m - m * p.to_f/100
a = s - s * (q.to_f/100)
puts a.ceil(2)