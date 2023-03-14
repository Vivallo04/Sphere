JAVA="java"
COMPILER="src/main/java/com/sphere/Main.java"
CC="gcc"

function compile {
	BN=$(basename -s .teeny $1)
	TTOUTPUT=$(${JAVA} ${COMPILER} $1 2>&1)
	if [ $? -ne 0 ]; then
		echo "${TTOUTPUT}"
	else
		mv out.c ${BN}.c
		CCOUTPUT=$(${CC} -o ${BN} ${BN}.c)
		if [ $? -ne 0 ]; then
			echo "${CCOUTPUT}"
		else
			echo "${TTOUTPUT}"
		fi
	fi
}

if [ $# -eq 0 ]; then
	for i in $(ls *.crpt); do
		compile $i
	done
else
	compile $1
fi