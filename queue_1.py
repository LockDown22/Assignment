from collections import deque

class Queue:
    def __init__(self, *elements):
        self._elements = deque(elements)
        self.size = 0

    def __len__(self):
        return len(self._elements)

    def __iter__(self):
        while len(self) > 0:
            yield self.dequeue()

    def enqueue(self, element):
        self._elements.append(element)

    def dequeue(self):
        return self._elements.popleft()

    def getSize(self):
        return self.size

if __name__ == "__main__":
    queue = Queue()
    for i in range(1, 6):
        queue.enqueue(i)
        # print({queue})
        
    for _ in range(1, 6):
        remove = queue.dequeue()
        print(f"Pop: {remove}")
    queue1 = queue.getSize()
    print(queue1)
    # print(f"dequeue: {queue}")