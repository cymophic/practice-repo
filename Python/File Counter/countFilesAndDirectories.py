import os
from datetime import datetime

PATH = 'F:\My Stuff\Coding'

red = "\033[91m"
green = "\033[92m"
yellow = "\033[93m"
blue = "\033[94m"
lightblue = "\033[96m"

bold = "\033[1m"
underline = "\033[4m"
italic = "\033[3m"
reset = "\033[0m"

if not os.path.exists(PATH):
    print(f"The directory {PATH} does not exist.")
else:
    fileCount = 0
    directoryCount = 0

    startTime = datetime.now()
    for root, directories, files in os.walk(PATH):
        print(f'{yellow}{bold}Looking in:{reset}', root)
        for directory in directories:
            directoryCount += 1
        for file in files:
            fileCount += 1
    
    finishTime = datetime.now()
    duration = finishTime - startTime
    print(f'{green}{italic}Scan completed in {int(duration.total_seconds())}s. {reset}')
    print(f'{blue}{bold}Number of files:{reset}', fileCount)
    print(f'{blue}{bold}Number of directories:{reset}', directoryCount)
