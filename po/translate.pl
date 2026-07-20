#!/usr/bin/perl -w
use Locale::TextDomain ('my-package',@locale_dirs);

use Locale::TextDomain qw (my-package ./);

my $translated = __"Hello World!\n";

my $alt = $__{"Hello World!\n"};

my $alt2 = $__->{"Hello World!\n"};

my @list = (N__"Hello",
N__"World");

printf (__n ("one file read", 
"%d files read", 
$num_files),
$num_files);

print __nx ("one file read", "{num} files read", $num_files,
num => $num_files);

my $translated_context = __p ("Verb, to view", "View");

printf (__np ("Files read from filesystems",
"one file read", 
"%d files read", 
$num_files),
$num_files);

print __npx ("Files read from filesystems",
"one file read", 
"{num} files read", 
$num_files,
num => $num_files);
