def wait_until_message_received():
    msg = try_to_receive_message()
    while msg is None:
        time.sleep(5)
        msg = try_to_receive_message()
    return msg
