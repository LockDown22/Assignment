import array as arr
class Node:
    def __init__(self, value):
        self.value = value
        self.next = None


class Stack:
    def __init__(self):
        self.head = Node("")
        self.size = 0

    def __str__(self):
        cur = self.head.next
        out = ""
        while cur:
            out += str(cur.value) + "->"
            return out[:-3]

    def getSize(self):
        return self.size
 
    def isEmpty(self):
        return self.size == 0
    
    def peek(self):
            
        if self.isEmpty():
            raise Exception("Peeking from an empty stack")
        return self.head.next.value
    
    def push(self, value):
        node = Node(value)
        node.next = self.head.next
        self.head.next = node
        self.size += 1
    
    def pop(self):
        if self.isEmpty():
            raise Exception("Popping from an empty stack")
        remove = self.head.next
        self.head.next = self.head.next.next
        self.size -= 1
        return remove.value

    # def full():
        
if __name__ == "__main__":
    stack = Stack()
    n = int(input('nhap n'))
    m = int(input('nhap m'))
    for i in range(n, m):
        stack.push(i)
    print(f"Stack: {stack}")
 
    for _ in range(n, m-1):
        remove = stack.pop()
        print(f"Pop: {remove}")
    print(f"Stack: {stack}")
    
