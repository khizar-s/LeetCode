class Solution:
    def defangIPaddr(self, address: str) -> str:
        r = ""
        for x in address:
            if (x == "."):
                r += "[.]"
            else:
                r += x
        return r