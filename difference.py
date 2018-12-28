@outputSchema("earliest_year:int")
def earliestYear(row):
	count = 0
	for i,k in enumerate(row):
		if count > 53 :
			data = str(k).split(",")
			if data[0] != '(None':       
				return (1960 + count - 4)
		count += 1
	return 0

@outputSchema("latest_year:int")      
def latestYear(row):
	count = 0
	for i,k in reversed(row):
		if count < 6 :
			data = str(k).split(",")
			if data[0] != '(None':
				return (2016 - count)
		count += 1
	return 0

@outputSchema("difference:double")      
def difference(row):
	first_value = 0.0
	last_value = 0.0
	lastResult = 'None'
	count = 0
	for i,k in enumerate(row):
		if count > 53 :
			data = str(k).split(",")
			if data[0] != '(None':       
				first_value = double (str(k)[1:-2])
		count += 1
	count = 0
	for i,k in reversed(row):
		if count < 6 :
			data = str(k).split(",")
			if data[0] != '(None':
				last_value = double (str(k)[1:-2])
		count += 1
	if (first_value!=0) and (last_value!=0) and (first_value!=last_value) and
	(first_value<1.0) and (last_value>first_value):
		return (last_value-first_value)
	return 0.0