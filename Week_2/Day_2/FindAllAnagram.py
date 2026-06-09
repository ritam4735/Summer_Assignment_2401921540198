class Solution:
    def findAnagrams(self, s: str, p: str) -> List[int]:
        if len(p) > len(s):
            return []

        need = [0] * 26
        window = [0] * 26

        for ch in p:
            need[ord(ch) - ord('a')] += 1

        k = len(p)
        ans = []

        for i in range(k):
            window[ord(s[i]) - ord('a')] += 1

        if need == window:
            ans.append(0)

        for i in range(k, len(s)):
            window[ord(s[i]) - ord('a')] += 1
            window[ord(s[i - k]) - ord('a')] -= 1

            if need == window:
                ans.append(i - k + 1)

        return ans