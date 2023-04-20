echo "Compiling Compiler"
javac compiler/*.java -d compiler/out
echo "Compiling Virtual Machine"
javac runtime/*.java -d runtime/out
javac runtime/includes/*.java -d runtime/out
echo "Compiled VM, moving to run script"
sh run.sh