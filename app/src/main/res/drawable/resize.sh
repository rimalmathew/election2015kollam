#!/bin/bash

for f in $n*.jpg
do
	new="$(echo $f | tr '[:upper:]' '[:lower:]')"
	echo $f
	echo $new
	mv "$f" "prev_$new"
done
