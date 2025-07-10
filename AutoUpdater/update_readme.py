from datetime import datetime, timezone

utc_hour = datetime.now(timezone.utc).hour

ist_hour = (utc_hour + 5) % 24  # Convert to IST (roughly)

if 6 <= ist_hour < 18:
    source = "README_day.md"
else:
    source = "README_night.md"

with open(source, "r", encoding="utf-8") as src:
    content = src.read()

with open("README.md", "w", encoding="utf-8") as dest:
    dest.write(content)
