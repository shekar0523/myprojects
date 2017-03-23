def greet_many(names):
    for name in names:
        print 'Hello %s' % name

def count_up(limit):
    for num in range(1, limit+1):
        if num == limit:
            print 'bye!'
        else:
            print num
