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


# m = gets.to_i
# p = gets.to_i
# q = gets.to_i

# s = m - m * p.to_f/100
# a = s - s * (q.to_f/100)
# puts a.ceil(2)

# x = {"ruby"=>1 , "php"=>2 , "java"=>3}
# p x.values # 1 2 3が表示される
# p x.keys   # ruby php javaが表示される
# x.store("python",4) #ハッシュにkeyとvalueを追加
# p x
# p x.select {|k, v| v >= 3} #３以上の値を表示

a = ["ruby","php",nil,"java",nil]
p a
p a.compact #配列のnil要素を削除
p a.join(",") #配列の要素を結合して一つの文字列にする
a.push("python") #配列に要素を連結
p a
p a.pop #削除した要素を確認できる
a.pop(2) #配列の末尾を削除 引数で数を指定
p a
p a.shift #配列の最初の要素を削除
p a
a.unshift("aaaa") #配列の最初に要素を挿入
p a