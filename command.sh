#in one terminal, start the log generator:
python3 log-generator.py
# in a 2nd terminal, watch the output from the logs:
# every 5 seconds, you should see new entries
tail -f /tmp/log-generator.log > /home/ahmed/data/data.csv
