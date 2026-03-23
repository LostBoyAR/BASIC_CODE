# Write a Python programme to sort (ascending and descending) a dictionary by value.

dict = {'apple': 3, 'banana': 1, 'cherry': 2, 'date': 5, 'elderberry': 4}

asc_sorted = dict(sorted(dict.items(), key=lambda item: item[1]))
print("Dictionary sorted in ascending order:", asc_sorted)

desc_sorted = dict(sorted(dict.items(), key=lambda item: item[1], reverse=True))
print("Dictionary sorted in descending order:", desc_sorted)

