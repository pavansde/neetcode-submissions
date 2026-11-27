class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        cols = defaultdict(set)
        rows = defaultdict(set)
        box = defaultdict(set)
        
        for row in range(9):
            for col in range(9):
                num = board[row][col]
                if num == '.':
                    continue
                if num in rows[row] or num in cols[col] or num in box[row//3, col//3]:
                    return False
                rows[row].add(num)
                cols[col].add(num)
                box[row//3, col//3].add(num)
        return True
        