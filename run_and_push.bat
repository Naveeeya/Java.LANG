@echo off
cd /d "C:\path\to\Java.LANG"
git add .
set /p msg=Enter commit message:
git commit -m "%msg%"
git push origin main
pause
