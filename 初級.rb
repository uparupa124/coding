age = gets.to_i

if age % 400 == 0
  p "閏年です"
elsif age % 100 == 0
  p "閏年ではない"
elsif age % 4 == 0
  p "閏年です"
else
  p "閏年ではない"
end
# 条件の記述順に注意する