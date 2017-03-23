def is_positive(number):
    if number > 0:
        return True
    return False

def greet(name, time):
    if 7 < time < 12:
        print 'Good morning %s' % name
    elif time < 18:
        print 'Good afternoon %s' % name
    elif time < 23:
        print 'Good night %s' % name
    else:
        print '%s, you should be sleeping!' % name